;; Sequences: filter
;; https://www.4clojure.com/problem/18

(= '(6 7) (filter #(> % 5) '(3 4 5 6 7)))
