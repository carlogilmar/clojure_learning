(ns unittesting.core
  (:require [clojure.test :refer [is testing with-test deftest run-tests]]
            [clojure.string :as s]))

(println "Hola desde mi unit testing!!")

(deftest foo_test
         (testing "This is my first test" (is false)))

(run-tests)
