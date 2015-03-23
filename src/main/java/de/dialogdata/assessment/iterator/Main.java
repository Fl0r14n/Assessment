package de.dialogdata.assessment.iterator;

public class Main {

    public static void main(String[] args) {
        TreeNode<Character> root = new TreeNode<>('*');

        root.addChild('h').addChild('e').addChild('l').addChild('l').addChild('o');
        root.addChild(',').addChild(' ');
        root.addChild('w').addChild('o').addChild('r').addChild('l').addChild('d');
        root.addChild('*');

        StringBuilder sb = new StringBuilder();
        for (char c : root) {
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
