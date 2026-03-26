### Ex3

#### Ex3.1

- (a) --> not corret since its not always the lower bound of O(n)
- (b) --> correct
- (c) --> correct

#### Ex3.2

##### (a)

inner loop: n-i-1
outer loop: n-1

$$
\sum_{n-i-1} \sum_{n-1}^i
$$

##### (b)

loop as long 10 is not dividable with 10 and no rest:
- must b e constant O(1) time because there are only 10 digits and modulo has to iterate at max 10 times to find a rest with 0

##### (c)

loop until n = 0
- divide by 2 so it halves the size
- $\in$ O(log(n))


##### Ex 3.3

Binary search 