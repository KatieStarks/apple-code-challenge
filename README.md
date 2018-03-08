# apple-code-challenge

This project is for the Apple technical assessment, to be submitted with an application. The program provides the solutions to day 1, 2, and 4 of Advent of Code 2017, found at [http://adventofcode.com/2017](http://adventofcode.com/2017).

## Environment Setup

This project is written with Clojure, and requires the current version of Leiningen (2.7+) to be installed as well as for Java (1.8) and Clojure (1.8).

See here for installation instructions: [https://leiningen.org/#install](https://leiningen.org/#install)

## Usage

The program can be run from the command line by using `lein run` from within the project directory. This will execute both parts of each day's solution with input defined in `core.clj`.

`lein test` will run the unit tests.


## Examples

```
$ lein run

Day 1 Part 1:  1031
Day 1 Part 2:  1080
Day 2 Part 1:  45158
Day 2 Part 2:  294
Day 4 Part 1:  466
Day 4 Part 2:  251
```

```
$ lein test

lein test apple-code-challenge.core-test

Ran 6 tests containing 19 assertions.
0 failures, 0 errors.
```



## License

Copyright © 2018 Katie Ballinger.

Distributed under the Eclipse Public License.