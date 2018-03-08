(ns apple-code-challenge.core-test
  (:require [clojure.test :refer :all]
            [apple-code-challenge.day1 :as day1]
            [apple-code-challenge.day2 :as day2]
            [apple-code-challenge.day4 :as day4]))

;;;;;;;;;;;
;; DAY 1 ;;
;;;;;;;;;;;

(deftest day1-part1
  (testing "Test cases for day 1, part 1 code challenge"
    (is (= 3 (day1/part1 1122)))
    (is (= 4 (day1/part1 1111)))
    (is (= 0 (day1/part1 1234)))
    (is (= 9 (day1/part1 91212129)))))

(deftest day1-part2
  (testing "Test cases for day 1, part 2 code challenge"
    (is (= 6  (day1/part2 1212)))
    (is (= 0  (day1/part2 1221)))
    (is (= 4  (day1/part2 123425)))
    (is (= 12 (day1/part2 123123)))
    (is (= 4  (day1/part2 12131415)))))

;;;;;;;;;;;
;; DAY 2 ;;
;;;;;;;;;;;

(deftest day2-part1
  (testing "Test cases for day 2, part 1 code challenge"
    (is (= 18 (day2/part1 (slurp "resources/day2input-test1.txt"))))))

(deftest day2-part2
  (testing "Test cases for day 2, part 2 code challenge"
    (is (= 9 (day2/part2 (slurp "resources/day2input-test2.txt"))))))

;;;;;;;;;;;
;; DAY 4 ;;
;;;;;;;;;;;

(deftest day4-part1
  (testing "Test cases for day 4, part 1 code challenge"
    (is (= 1  (day4/part1 "aa bb cc dd ee")))
    (is (= 0 (day4/part1 "aa bb cc dd aa")))
    (is (= 1  (day4/part1 "aa bb cc dd aaa")))))

(deftest day4-part2
  (testing "Test cases for day 4, part 2 code challenge"
    (is (= 1  (day4/part2 "abcde fghij")))
    (is (= 0 (day4/part2 "abcde xyz ecdab")))
    (is (= 1  (day4/part2 "a ab abc abd abf abj")))
    (is (= 1  (day4/part2 "iiii oiii ooii oooi oooo")))
    (is (= 0 (day4/part2 "oiii ioii iioi iiio")))))

