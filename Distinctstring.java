public class Distinctstring { 
static int char = 256; 
static int max(String str, int n) { 
int c[] = new int[char]; 
for (int i = 0; i < n; i++) { 
c[str.charAt(i)]++; 
} 
int max = 0; 
for (int i = 0; i < char; i++) { 
if (c[i] != 0) { 
max++; 
} 
} 
return max; 
} 
static int smallest(String str) { 
int n = str.length();     
int max = max(str, n); 
int min = n; 
for (int i = 0; i < n; i++) { 
for (int j = 0; j < n; j++) { 
String sub = null; 
if(i<j) 
sub = str.substring(i, j); 
else
sub = str.substring(j, i); 
int length = sub.length();
int distinct = max(sub, length);
if (length < min && max == distinct) { 
min = length; 
} 
} 
} 
return min; 
} 
static public void main(String[] args) { 
String str ="ABCDA"; 
int len = smallest(str); 
System.out.println(len); 
} 
} 

