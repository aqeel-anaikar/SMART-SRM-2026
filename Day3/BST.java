public class BST {
    class node {
        int data;
        node left, right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    node root = null;

    public void insert(int data) {
        node newnode = new node(data);
        // when First node to create
        if (root == null) {
            root = newnode;
            return;
        }
        // when Root is alredy allocated
        node temproot = root;
        while (true) {
            if (data < temproot.data) {// checking data with root to add in left 
                if (temproot.left == null) { // checking left is null
                    temproot.left = newnode;
                    return;
                }
                temproot = temproot.left;
            } else {
                if (data > temproot.data) {// checking data with root to add in right
                    if (temproot.right == null) { // checking right is null
                        temproot.right = newnode;
                        return;
                    }
                    temproot = temproot.right;
                }
            }
        }

    }

    public boolean search(int key){
        node temproot = root;
        while(temproot!=null){
            if(temproot.data == key){
                return true;
            }
            else if(key < temproot.data)
                temproot = temproot.left;
            else if(key> temproot.data)
                temproot = temproot.right;
            else return false;
        }
        return false;
    }


    // public void printleft(){
    //     node temproot = root;
    //     while (temproot!=null) {
    //         System.out.println(temproot.data+ " ");
    //         temproot = temproot.left;
    //     }
    // }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(10);
        tree.insert(16);
        tree.insert(8);
        tree.insert(77);
        tree.insert(52);
        tree.insert(48);
        tree.insert(24);
        tree.insert(11);
        System.out.println(tree.search(11));
    }
}
