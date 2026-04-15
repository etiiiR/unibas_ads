## Ex1.1

### (a)

- step 0:
a := [7,5,4,9,6,2,4]
- step1:
a = [5,7,4,9,6,2,4]
- step2:
a = [4,5,7,9,6,2,4]
- step3:
a = [4,5,7,9,6,2,4]
- step4:
a = [4,5,6,7,9,2,4]
- step5:
a = [2,4,5,6,7,9,4]
- step6:
a = [2,4,4,5,6,7,9]

### (b)
b := [7,6,4,9,2,4]

lo := 0; mid := 2; hi := 5

#### merge phase


| k | assignment to tmp                        | i, j at end of iteration |
| - | ---------------------------------------- | ------------------------ |
| 0 | tmp[0] = 1 (from right, a[j])            | i=0, j=4                 |
| 1 | tmp[1] = 4 (from right)                  | i=0, j=5                 |
| 2 | tmp[2] = 5 (from left, a[i])             | i=1, j=5                 |
| 3 | tmp[3] = 6 (from right)                  | i=1, j=6                 |
| 4 | tmp[4] = 7 (right exhausted → from left) | i=2, j=6                 |
| 5 | tmp[5] = 8 (from left)                   | i=3, j=6                 |

