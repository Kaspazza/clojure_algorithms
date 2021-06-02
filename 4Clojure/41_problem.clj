;;Drop Every Nth Item
;;https://www.4clojure.com/problem/41


(= (#(apply concat (partition-all (dec %2) %2 %1)) [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])

(= (#(apply concat (partition-all (dec %2) %2 %1)) [:a :b :c :d :e :f] 2) [:a :c :e])

(= (#(apply concat (partition-all (dec %2) %2 %1)) [1 2 3 4 5 6] 4) [1 2 3 5 6])
