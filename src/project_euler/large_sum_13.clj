(ns project-euler.large_sum_13
  (:require [clojure.java.io :as io]))

(with-open [rdr (io/reader "../../data/large_sum.txt")]
  (println (apply str (take 10 (str (reduce + (map read-string (line-seq rdr))))))))



