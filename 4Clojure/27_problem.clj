;; Palindrome Detector
;; https://www.4clojure.com/problem/27

(false? (#(if (string? %) (= % (apply str (reverse %))) (= % (reverse %))) '(1 2 3 4 5)))

(true? (#(= (seq %) (reverse %)) "racecar"))

(true? (#(= (seq %) (reverse %)) [:foo :bar :foo]))

(true? (#(= (seq %) (reverse %)) '(1 1 3 3 1 1)))

(false? (#(= (seq %) (reverse %)) '(:a :b :c)))
