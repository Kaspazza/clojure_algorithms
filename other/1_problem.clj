;; Inspired by tweet
;; https://twitter.com/Al_Grigor/status/1357028887209902088?s=20
;; Input "aaaabbbcca" Output "[("a" 4), ("b" 3), ("c", 2), ("a", 1)]"

(map (juxt (comp str first) count) (partition-by identity "aaaabbbccd"))
