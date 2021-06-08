;; Intro to Iterate
;; https://www.4clojure.com/problem/45

(= '(1 4 7 10 13) (take 5 (iterate #(+ 3 %) 1)))
