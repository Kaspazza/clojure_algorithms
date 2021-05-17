;; Last Element
;; https://www.4clojure.com/problem/19

(= (#(first (reverse %)) [1 2 3 4 5]) 5)

(= ((fn [x] (if-let [r (next x)] (recur r) (first x))) '(5 4 3)) 3)

(= (#(-> % reverse first) ["b" "c" "d"]) "d")
