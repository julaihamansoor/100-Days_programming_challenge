//fuction to find the second largest - (better solution)

int secondLargest (vector<int> &a, int n) {
int largest = a[0];
int slargest = -1;
for(int i=1;i<n;i++){
if(a[i]> largest) {
slargest=largest;
largest = a[i];
}
else if(a[i] < largest && a[i]> slargest) {
slargest = a[i];
}
return slargest;
}

vector<int> getSecond Order Elements (int n, vector<int> a)
int slargest = secondLargest (a, n);

return {slargest, ssmallest};
}
