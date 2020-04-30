(ns diamond-kata.core-test
  (:require [clojure.test :refer :all]
            [diamond-kata.core :refer :all]))


(deftest a-test
(is (= "A" (diamond-str \A))))
