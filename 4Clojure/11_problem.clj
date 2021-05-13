;; Maps: conj
;; https://www.4clojure.com/problem/11

(= {:a 1, :b 2, :c 3} (conj {:a 1} {:b 2} [:c 3]))
