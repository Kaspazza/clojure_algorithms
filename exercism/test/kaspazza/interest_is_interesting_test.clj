(ns kaspazza.interest-is-interesting-test
  (:require [kaspazza.interest-is-interesting :as interest-is-interesting]
            [clojure.test :refer [deftest testing is]]))

(deftest test-empty-balance-interest-rate
  (testing
   (is (= 0.5
          (interest-is-interesting/interest-rate 0M)))))

(deftest test-negative-balance-interest-rate
  (testing
   (is (= -3.213
          (interest-is-interesting/interest-rate -5M)))))

(deftest test-annual-balance-update-small-positive-balance
  (testing
      (is (= 0.000001005M
             (interest-is-interesting/annual-balance-update 0.000001M)))))

(deftest test-annual-balance-update-small-negative-balance
  (testing
      (is
       (= -0.12695199M
          (interest-is-interesting/annual-balance-update -0.123M)))))
