;; Split a sequence
;; https://www.4clojure.com/problem/49

(= ((fn [n col] [(take n col) (drop n col)]) 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])

(= ((juxt take drop) 1 [:a :b :c :d]) [[:a] [:b :c :d]])

(= ((juxt take drop) 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])
