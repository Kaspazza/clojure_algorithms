(ns kaspazza.bird-watcher-test
  (:require [clojure.test :refer :all]
            [kaspazza.bird-watcher :as bird-watcher :refer :all]))

(deftest last-week-test
  (testing "FIXME, I fail."
    (is (= [0 2 5 3 7 8 4] bird-watcher/last-week))))

(deftest today-disappointing-week-test
  (testing "Today's bird count of disappointing week" (is (= 0 (bird-watcher/today [0 0 2 0 0 1 0])))))

(deftest today-busy-week-test
  (testing "Today's bird count of busy week" (is (= 10 (bird-watcher/today [8 8 9 5 4 7 10])))))

(deftest increment-bird-no-visits-test
  (testing "Increment today's count with no previous visits" (is (= [6 5 5 11 2 5 1] (bird-watcher/inc-bird [6 5 5 11 2 5 0])))))

(deftest increment-bird-multiple-visits-test
  (testing "Increment today's count with multiple previous visits" (is (= [5 2 4 2 4 5 8] (bird-watcher/inc-bird [5 2 4 2 4 5 7])))))

(deftest day-without-birds-test
  (testing "Has day without birds with day without birds" (is (= true (bird-watcher/day-without-birds? [5 5 4 0 7 6 7])))))

(deftest no-day-without-birds-test
  (testing "Has day without birds with no day without birds" (is (= false (bird-watcher/day-without-birds? [5 5 4 1 7 6 7])))))