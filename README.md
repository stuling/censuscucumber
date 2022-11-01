[![Java CI with Maven](https://github.com/stuling/censuscucumber/actions/workflows/maven.yml/badge.svg)](https://github.com/stuling/censuscucumber/actions/workflows/maven.yml)

#### Test Results
4 tests   4 [:heavy_check_mark:](https://github.com/EnricoMi/publish-unit-test-result-action/blob/v1.20/README.md#the-symbols "passed tests")  0s [:stopwatch:](https://github.com/EnricoMi/publish-unit-test-result-action/blob/v1.20/README.md#the-symbols "duration of all tests")  
1 suites  0 [:zzz:](https://github.com/EnricoMi/publish-unit-test-result-action/blob/v1.20/README.md#the-symbols "skipped / disabled tests")  
1 files    0 [:x:](https://github.com/EnricoMi/publish-unit-test-result-action/blob/v1.20/README.md#the-symbols "failed tests")

Results for commit 1e56faae.

### Description:
A repo to demonstrate unit tests on a simple Address class using the Cucumber framework and JUnit

### Address Class:
{String street, String city, String state}

### Assumptions:
1. the class does some simple cleanup for case, extra spaces, and weird punctuation

For example, the address "123 1st Ave.  " would be stripped down to
> "123 1st ave"

2. Yes, this is contrived and a lousy idea in the real world


### Technical Details:
| Tool         | Details                                |
|--------------|----------------------------------------|
| IDE          | IntelliJ IDEA Community Edition 2022.1 |
| Language     | Java                                   |
| JDK          | jdk-11.0.14.101-hotspot                |
| Build System | Maven project                          |
| Unit Tests   | JUnit 5                                |
| Cucumber     | 7.8.1                                  |