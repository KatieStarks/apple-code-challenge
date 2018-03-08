(ns apple-code-challenge.day4
  (:require [clojure.string :as str]))

;; http://adventofcode.com/2017/day/4

;;;;;;;;;;;;
;; PART 1 ;;
;;;;;;;;;;;;

(defn separate-passes
  "Break each passphrase into separate words"
  [input]
  (map #(str/split % #" ") (str/split-lines input)))

(defn find-diff
  "Determine if a passphrase has duplicate words"
  [input]
  (if (= (count (distinct input))
         (count input))
    1
    0))

(defn part1
  "Solves part 1 of http://adventofcode.com/2017/day/4"
  [input]
  (reduce + (map find-diff (separate-passes input))))


;;;;;;;;;;;;
;; PART 2 ;;
;;;;;;;;;;;;

(defn anagrams?
  "Check for anagrams in passphrase"
  [pass]
  (find-diff (map sort pass)))

(defn part2
  "Solves part 2 of http://adventofcode.com/2017/day/4"
  [input]
  (reduce + (map anagrams? (separate-passes input))))