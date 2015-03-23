package de.dialogdata.assessment.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class TreeNode<T> implements Iterable<T> {

    List<TreeNode<T>> children;
    private T data;

    public TreeNode() {
        children = new ArrayList<>();
    }

    public TreeNode(T data) {
        this();
        setData(data);
    }

    public List<TreeNode<T>> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode<T> addChild(T data) {
        TreeNode<T> child = new TreeNode<>(data);
        children.add(child);
        return child;
    }

    @Override
    public Iterator<T> iterator() {
        List<T> result = new ArrayList<>();
        result.add(data);
        for (TreeNode<T> node : children) {
            traverse(node, result);
        }
        return result.iterator();
    }
    
    private void traverse(TreeNode<T> root, List<T> list) {
        list.add(root.data);
        for (TreeNode<T> node : root.getChildren()) {
            traverse(node, list);
        }
    }
}
