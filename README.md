# Is the grass greener on the other side?
[![Build Status](https://travis-ci.org/jaimedantas/the-grass-is-greener.svg?branch=main)](https://travis-ci.org/jaimedantas/the-grass-is-greener.svg?branch=main)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=the-grass-is-greener&metric=alert_status)](https://sonarcloud.io/dashboard?id=the-grass-is-greener)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=the-grass-is-greener&metric=coverage)](https://sonarcloud.io/dashboard?id=the-grass-is-greener)


Here you can find out whether this common expression is fake or not. 
I created this code for using in the solution of a probability problem proposed by 
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
assertEquals(new BigDecimal("0.666"), probabilityA);
assertEquals(new BigDecimal("0.666"), probabilityB);
assertEquals(new BigDecimal("0.666"), probabilityC);
```
Notice that all three are identical to `2/3` when we have a large number of executions, defined by the variable `EXECUTIONS`. The class
`Selector` is responsible for randomly selecting our courses. <br />
The test was made with 500000 executions, and the precision is three decimal places.


