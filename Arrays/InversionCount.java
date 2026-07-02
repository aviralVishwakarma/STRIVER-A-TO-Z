public class Solution {
    int count = 0 ;
    public int countInversions(int[] A) {
        int l = 0 ;
        int r = A.length-1;
        mergeSort(A,l,r);
        return count;
        
    }
    public void mergeSort(int[] A ,int l ,int r){
        if(l>=r)return;
        int m = (l+r)/2;
        mergeSort(A,l,m);
        mergeSort(A,m+1,r);
        merge(A,l,m,r);
        
    }
    public void merge(int[] A ,int l , int m, int r){
        int left = l;
        int right = m+1;
        int temp[] = new int[r-l+1];
        int k = 0;
        while(right<=r && left<=m){
            if(A[left]<=A[right]){
               temp[k++]=A[left++]; 
            }
            else{
                temp[k++]=A[right++];
                count += (m - left + 1);//Issue
            }
        }
        while(left<=m){
            temp[k++]=A[left++];
        }
        while(right<=r){
            temp[k++]=A[right++];
        }
        for(int i = l; i <= r; i++){
            A[i] = temp[i-l];
        }
    }
}
/*
# Count Inversions Using Merge Sort (Optimal Solution)

## Problem Statement

Given an array `A`, count the number of **inversions**.

An inversion is a pair of indices `(i, j)` such that:

* `i < j`
* `A[i] > A[j]`

### Example

```text
Input:
A = [5, 3, 2]

Output:
3

Explanation:
(5,3)
(5,2)
(3,2)
```

---

# Brute Force Approach

Check every pair of elements.

```java
for (int i = 0; i < n; i++) {
    for (int j = i + 1; j < n; j++) {
        if (A[i] > A[j]) {
            count++;
        }
    }
}
```

### Complexity

* Time: **O(n²)**
* Space: **O(1)**

This is too slow for large arrays.

---

# Optimal Approach (Merge Sort)

The optimal solution uses **Merge Sort**.

### Why Merge Sort?

Merge Sort divides the array into two halves.

While merging two **already sorted** halves, we can efficiently count inversions.

---

# Key Observation

Suppose we are merging:

```text
Left  = [3, 5, 8]
Right = [2, 6, 9]
```

Pointers:

```text
left → 3
right → 2
```

Since

```text
3 > 2
```

and the left half is already sorted,

```text
5 > 2
8 > 2
```

must also be true.

Therefore, one comparison gives multiple inversions.

Instead of counting one inversion,

we count

```text
(mid - left + 1)
```

because every remaining element in the left half is greater than the current element in the right half.

---

# Algorithm

1. Divide the array into two halves.
2. Recursively count inversions in the left half.
3. Recursively count inversions in the right half.
4. Count inversions while merging.
5. Return

```text
Left Inversions
+ Right Inversions
+ Merge Inversions
```

---

# Why Does mergeSort() Return an Integer?

Instead of using a global variable, each recursive call returns the number of inversions found in its subarray.

```java
leftCount = mergeSort(left)
rightCount = mergeSort(right)
mergeCount = merge()

return leftCount + rightCount + mergeCount
```

This makes recursion clean and avoids issues with Java's pass-by-value behavior.

---

# Merge Logic

During merge:

```text
while(left <= mid && right <= r)
```

### Case 1

```text
A[left] <= A[right]
```

Copy the left element.

```java
temp[k++] = A[left++];
```

No inversion exists.

---

### Case 2

```text
A[left] > A[right]
```

Copy the right element.

```java
temp[k++] = A[right++];
```

Count inversions:

```java
count += (mid - left + 1);
```

Why?

Every remaining element in the left half is greater than `A[right]`.

---

# Example Dry Run

Input:

```text
[5,3,2]
```

### Step 1

Split

```text
        [5,3,2]
        /     \
     [5,3]    [2]
```

---

### Merge [5] and [3]

```text
5 > 3
```

Inversions

```text
(5,3)
```

Count = 1

Merged

```text
[3,5]
```

---

### Merge [3,5] and [2]

Compare

```text
3 > 2
```

Remaining left elements

```text
3
5
```

Both are greater than 2.

Inversions

```text
(3,2)
(5,2)
```

Count = 2

Merged

```text
[2,3,5]
```

---

Total inversions

```text
Left = 1
Right = 0
Merge = 2

Answer = 3
```

---

# Complete Java Code

```java
public class Solution {

    public int countInversions(int[] A) {
        return mergeSort(A, 0, A.length - 1);
    }

    public int mergeSort(int[] A, int l, int r) {

        if (l >= r)
            return 0;

        int mid = l + (r - l) / 2;

        int leftCount = mergeSort(A, l, mid);
        int rightCount = mergeSort(A, mid + 1, r);
        int mergeCount = merge(A, l, mid, r);

        return leftCount + rightCount + mergeCount;
    }

    public int merge(int[] A, int l, int mid, int r) {

        int[] temp = new int[r - l + 1];

        int left = l;
        int right = mid + 1;
        int k = 0;

        int count = 0;

        while (left <= mid && right <= r) {

            if (A[left] <= A[right]) {
                temp[k++] = A[left++];
            } else {
                temp[k++] = A[right++];
                count += (mid - left + 1);
            }
        }

        while (left <= mid)
            temp[k++] = A[left++];

        while (right <= r)
            temp[k++] = A[right++];

        for (int i = l; i <= r; i++) {
            A[i] = temp[i - l];
        }

        return count;
    }
}
```

---

# Complexity Analysis

| Operation           | Complexity      |
| ------------------- | --------------- |
| Divide              | O(log n) levels |
| Merge at each level | O(n)            |
| Total Time          | **O(n log n)**  |
| Extra Space         | **O(n)**        |

---

# Common Mistakes

### 1. Using `count++`

Incorrect:

```java
count++;
```

Correct:

```java
count += (mid - left + 1);
```

---

### 2. Passing `count` as a parameter

```java
mergeSort(A, l, r, count);
```

This does not work because Java passes primitive types by value.

Instead:

* Return the count from `mergeSort()`, or
* Use a class variable.

---

### 3. Copying back incorrectly

Incorrect:

```java
for(int i = left; i <= right; i++)
```

Correct:

```java
for(int i = l; i <= r; i++)
```

because `left` and `right` have already moved during merging.

---

# Interview Tips

* Mention that Merge Sort naturally splits the problem into **left**, **right**, and **cross inversions**.
* Explain why `count += (mid - left + 1)` works using the fact that the left half is already sorted.
* Be prepared to discuss why the algorithm runs in **O(n log n)** and why it uses **O(n)** extra space.
*/
