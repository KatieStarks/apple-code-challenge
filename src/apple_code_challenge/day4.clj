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
  "Check how many passphrases are valid, watching out for duplicate words"
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
  "Check how many passphrases are valid, watching out for duplicate words including anagrams"
  [input]
  (reduce + (map anagrams? (separate-passes input))))