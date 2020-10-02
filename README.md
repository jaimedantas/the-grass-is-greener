# Is the the grass greener on the other side?
Here you can find out whether this common expression is fake or not. 
I created this code for using it in the solution of a probability problem proposed by 
Dr. Ruth Urner on one of her assignments for the Machine Learning Course at YU. 
### Problem
The problem consists of choosing two courses out of three in two sections. First,
the student was presented with two randomly chosen courses to pick one. On the
second pick, they would pick another out of the remained ones (including the one not
picked in the first try).
### How to execute
This solution was written in Java using [JUnit](https://junit.org/junit5/) tests. For checking the results, execute the unit test named `probabilityAllThreeCourses`
under the class `SelectorTest`. 
For the assert of the test, we have these three probabilities:
```java   
assertEquals(new BigDecimal("0.333"), probabilityA);
assertEquals(new BigDecimal("0.333"), probabilityB);
assertEquals(new BigDecimal("0.333"), probabilityC);
```
Notice that all three are identical when we have a large number of executions, defined by the variable `EXECUTIONS`. The class
`Selector` is responsible for randomly selecting our courses. <br />
The test was made with 500000 executions, and the precision is one decimal place.


