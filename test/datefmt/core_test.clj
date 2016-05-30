(ns datefmt.core-test
  (:require [clojure.test :refer :all]
            [clj-time.core :as t]
            [datefmt.core :refer :all]))

(deftest a-test
  (testing "dates etc."
    (is (= (t/date-time 2010 3 27)
           (fmt-date "27 mar 2010")))
    (is (= (t/date-time 2010 12 27)
           (fmt-date "27 dec 2010")))))
