;(ns fizzbuzz.core-test
;  (:require [clojure.test :refer :all]
;            [fizzbuzz.core :refer :all]))
;
;(deftest a-test
;  (testing "FIXME, I fail."
;    (is (= 0 1))))

(ns fizzbuzz.core-test
  (:use clojure.test
        fizzbuzz.core))

(deftest fizzbuzz-test
         (testing "This is my first test"
                  (is (= 0 (fizzbuzz 0)))
                  (is (= 1 (fizzbuzz 1)))
                  (is (= 2 (fizzbuzz 2)))
                  ))
