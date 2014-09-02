(ns project-euler.triangle-numbers-12)

(defn factors [x]
  "integer -> vector[integers]"
  (if (<= x 0)
  []
  (loop [xf [1 x] i 2]
    (if (> (* i i) x)
      (vec (sort (distinct xf)))
      (if (zero? (rem x i))
        (recur (conj xf i (/ x i)) (inc i))
        (recur xf (inc i)))))))

(println (last (first
      (filter #(>= (count %) 500)
              (map #(factors %)
                   (map #(reduce + (range 1 (inc %)))
                        (take 100000 (iterate inc 1))))))))
