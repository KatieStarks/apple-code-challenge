(ns apple-code-challenge.day2
  (:require [clojure.string :as str]))

;; http://adventofcode.com/2017/day/2

;;;;;;;;;;;;
;; PART 1 ;;
;;;;;;;;;;;;

(defn make-table
  "Create table from input file"
  [input]
  (map #(map read-string (str/split % #"\t")) (str/split-lines input)))

(defn checksum
  "Find the largest difference of a row of numbers"
  [row]
  (- (apply max row) (apply min row)))

(defn part1 [input]
  (reduce + (map checksum (make-table input))))

;;;;;;;;;;;;
;; PART 2 ;;
;;;;;;;;;;;;

(defn check-divisible [row]
  (reduce +
          (for [x row y row
                :when (not= x y)]
            (if (zero? (mod x y))
              (/ x y)
              0))))

(defn part2 [input]
  (reduce + (map check-divisible (make-table input))))