# backend_engineer_guide
A repository that helps understanding the concepts of prime focus for an aspiring backend engineer.

int indexShift = 0;
int k = 0;

1 2 3 4 33 4 4 5 6 7

1 2 3 33 5 6 7 

if(A[i] = 4){
    indexShift++;
}
else{
    int focusVal = A[i];
    A[i - indexShift] = focusVal;
    k++;
}