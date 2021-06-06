;; Reverse Interleave
;; https://www.4clojure.com/problem/43

(defn reverse-interleave
  ([arr n] (reverse-interleave arr n 0 {}))
  ([arr n counter m] (if (= counter (count arr))
                       (map val m)
                       (recur arr n (inc counter) (if (get m (mod counter n))
                                                    (assoc m (mod counter n) (conj (get m (mod counter n)) (get arr counter)))
                                                    (assoc m (mod counter n) (vector (get arr counter))))))))

(defn reverse-interleave2 [arr n]
  (loop [counter 0
        m {}]
    (if (= counter (count arr))
      (map val m)
      (recur (inc counter)
             (if (get m (mod counter n))
               (assoc m (mod counter n) (conj (get m (mod counter n)) (get arr counter)))
               (assoc m (mod counter n) (vector (get arr counter))))))))
(reverse-interleave2 [1 2 3 4 5 6] 2)

(def m {0 ["Kelly" "Dylan"]
        :hosts ["Adam" "Eve"]})

(assoc m (- 1 1) (conj (get m (- 1 1)) "Harry"))

(get m :hosts)

(get m :lol)


(get [1 2 3 4] 1)


(list 1 2 3 4)
