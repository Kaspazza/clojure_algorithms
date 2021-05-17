;; Penultimate Element
;; https://www.4clojure.com/problem/20

(= (#(-> % reverse second) (list 1 2 3 4 5)) 4)

(= (#(-> % reverse rest first) ["a" "b" "c"]) "b")

(= ((comp second reverse) [[1 2] [3 4]]) [1 2])
