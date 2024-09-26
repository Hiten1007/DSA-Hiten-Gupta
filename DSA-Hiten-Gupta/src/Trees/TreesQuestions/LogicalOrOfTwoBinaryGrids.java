package Trees.TreesQuestions;

public class LogicalOrOfTwoBinaryGrids {
    public Node intersect(Node quadTree1, Node quadTree2) {
        if(quadTree1 == null || quadTree2 == null) return null;
        if(quadTree1.isLeaf && quadTree2.isLeaf) return new Node(quadTree1.val || quadTree2.val, true, null , null, null, null);
        if(quadTree1.isLeaf) return quadTree1.val ? quadTree1 : quadTree2;
        if(quadTree2.isLeaf) return quadTree2.val ? quadTree2 : quadTree1;
        Node tL = intersect(quadTree1.topLeft, quadTree2.topLeft);
        Node tR = intersect(quadTree1.topRight, quadTree2.topRight);
        Node bL = intersect(quadTree1.bottomLeft, quadTree2.bottomLeft);
        Node bR = intersect(quadTree1.bottomRight, quadTree2.bottomRight);
        if(tL.isLeaf &&
                tR.isLeaf &&
                bL.isLeaf &&
                bR.isLeaf &&
                tL.val == tR.val &&
                tR.val == bL.val &&
                bL.val == bR.val) return new Node(tL.val, true, null, null, null, null);
        return new Node(false, false, tL, tR, bL, bR);
    }
    static class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;

        public Node() {}

        public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
            val = _val;
            isLeaf = _isLeaf;
            topLeft = _topLeft;
            topRight = _topRight;
            bottomLeft = _bottomLeft;
            bottomRight = _bottomRight;
        }
    };

}