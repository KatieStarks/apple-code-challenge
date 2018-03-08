(ns apple-code-challenge.day1)

;; http://adventofcode.com/2017/day/1

;;;;;;;;;;;;
;; PART 1 ;;
;;;;;;;;;;;;

(defn split-digits
  "Split digits into individual characters"
  [number]
  (map #(Character/digit % 10) (str number)))

(defn conj-first-digit
  "Add first digit to array of digits"
  [input]
  (conj (vec input) (first input)))

(defn compare-pair
  "Compare first two (pair), then recur, adding the value to it if it's a match"
  [input]
  (let [f (first input)
        s (second input)]
    (if (nil? s)
      0
      (if (== f s)
        (+ f (compare-pair (vec (rest input))))
        (compare-pair (vec (rest input)))))))

(defn part1
  "Solves part 1 of http://adventofcode.com/2017/day/1"
  [input]
  (->> input
       split-digits
       conj-first-digit
       compare-pair))

;;;;;;;;;;;;
;; PART 2 ;;
;;;;;;;;;;;;

(defn rotate
  "Rotates input by half for easy comparison"
  [input]
  (let [half (/ (count input) 2)]
    (flatten (conj (take half input) (drop half input)))))

(defn compare-lists
  "Return the value if both are equal"
  [x y]
  (if (== x y)
    x))

(defn part2
  "Solves part 2 of http://adventofcode.com/2017/day/1"
  [input]
  (let [split-input (split-digits input)
        rotated (rotate split-input)]
    (reduce + (filter #(not (nil? %)) (map compare-lists split-input rotated)))))