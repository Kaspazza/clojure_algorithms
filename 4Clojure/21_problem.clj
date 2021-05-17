;; Nth Element
;; https://www.4clojure.com/problem/21

(= ((fn [col step] (if (= step 0) (first col) (recur (rest col) (dec step)))) '(4 5 6 7) 2) 6)

(= (#(first (drop %2 %)) [:a :b :c] 0) :a)

(= (#(->> % (drop %2) first) [1 2 3 4] 1) 2)

(= ((fn [col step] (first (drop step col))) '([1 2] [3 4] [5 6]) 2) [5 6])
