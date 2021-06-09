;; Flipping out
;; https://www.4clojure.com/problem/46

(= 3 (((fn [f] #(f %2 %)) nth) 2 [1 2 3 4 5]))

(= true ((#(fn [a b] (% b a)) >) 7 8))

(= 4 (((fn [f] #(f %2 %)) quot) 2 8))

(= [1 2 3] (((fn [f] #(f %2 %)) take) [1 2 3 4 5] 3))
