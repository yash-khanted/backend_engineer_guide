import java.util.Stack;

//1. Nearest left number {google, amazon, apple, etc almost all companies}
/* Given an array of number 
 * arr = [5, 10, 4, 6, 7, 9]
 * ans = [-1, 5, -1, 4, 6, 7]
 * The agenda is to find the nearest value to the left of an number at any index, if no value is present then -1 is to return
*/

public class problems{
    public int[] NearestLeftSmall(int[] A) {
        //creating the return array and the index arr is for the index of the nearest elemnt
        int[] ans = new int[A.length];
        int[] indexAns = new int[A.length];
        //creating a stack to store the left values
        Stack<Integer> stackData = new Stack<>();

        for(int i=0; i<ans.length; i++){
            if(stackData.isEmpty()){
                //An empty stack has no potential answer so -1 is the answer
                ans[i] = -1;
                indexAns[i] = -1;
                //add the current value as it can be the potential answer for the element on right
                stackData.push(A[i]);
            }
            else{
                //if stack has some data then check if top element is smaller than the A[i], if not then pop the item till
                //either stack is empty or there is a smaller value
                boolean isAdded = false;
                while(!stackData.isEmpty() && isAdded == false ){
                    //this condition checks if the the next element is smaller to the right
                    if(stackData.peek() < A[i]){
                        //it true assign the value and change the isAdded condition
                        ans[i] = stackData.peek(); 
                        indexAns[i] = i;
                        isAdded = true;
                        //also push the current element as it can be the potential answer
                        stackData.push(A[i]);
                    }
                    else{
                        //if left element is not smaller then pop the element
                        stackData.pop();
                    }
                }
            }
        }

        return ans;
    }

//2. Remove First Occurence
/* let us suppose there is given string abbbcbccac 
 * the answe here is abcbac
 * the agenda is to remove the first the occurence
*/
    public String RemoveOccurence(String A) {
        //creating a null string
        String ans = null;
        //creating a character type stack
        Stack<Character> charStack = new Stack<>();
        charStack.push(A.charAt(0));

        for (int i=0; i<A.length(); i++) {
            char character = A.charAt(i);
            //if the character in the stack mathced with the next characted in the element then fo pop
            if(character == charStack.peek()){
                charStack.pop();
            }
            else{
                charStack.push(character);
            }
        }

        String result = null;
        for (Character character : charStack) {
            result += character;
        }
        
        for(int i = result.length() - 1; i >= 0; i--) { ans += result.charAt(i); }

        return ans;
    }

//3. Balanced Parantheses
/* the usltimate goal is to return 1 if the string of parantheses is balanced or else return 0
 * example for balanced string ({[]}), {}()[]
 * exmaple for unbalanced string []}, (([}))
 */
    public int BalancedParantheses(String A) {
        //creatung a character stack for use
        Stack<Character> data = new Stack<>();

        for(int i=0; i<A.length(); i++){
            //check if the stack is empty then do not do any comaparision, as it may give EmptyStackException
            if(data.isEmpty()) data.push(A.charAt(i));
            else{
                //if stack has data compare the peek element with character at index i
                char peekElement = data.peek();
                char stringElement = A.charAt(i);
                //PS I failed at writing this condition
                //match the right and left side then pop if they matchout or else push
                if(peekElement == '[' && stringElement == ']' ||
                   peekElement == '{' && stringElement == '}' ||
                   peekElement == '(' && stringElement == ')') data.pop();
                else data.push(stringElement);
            }
        }
        if(data.isEmpty()) return 1;
        else return 0;
        
    }

//4. UNIX - path Processing
/*Give a path of folder in UNIX style, like /c/..//./a/b/d 
* the processed path id /a/b/d 
* /.. means move one directory up
* take care of the fact that while using stact if /.. is input on an empty stack then handle it without error
*/

    public String UnixPathProcessor(String path) {
        //creating a string object type stack that will hold the directories between two slashes 
        Stack<String> directories = new Stack<>();
        //an empty string answer
        String result = "";

        //the logic is to find the string character between any two slashes and perform ppush and pop on the stack

        return result;
        
        
    }
//MergeSort in stack
/* write a code that merge two sorted stack and using recursion sort the unsorted stacks */

/*
 * Convert the absolute path to a linux file to acutual path
 * for example, let /a/.//../c/../b is the provided absolute path for the file for which the actual path is /b
 * 
 * Idea:
 * Instantiate a stack and store each value characted separated by slash
 * iterate over entire string. When ever you encounter two slash get he data in between them.
 * }
 */
}