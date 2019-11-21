(defun selection-sort-list (list predicate)
  (flet ((min-first (list)
           (do ((before-min nil)
                (min (first list))
                (prev list (rest prev))
                (curr (rest list) (rest curr)))
               ((endp curr)
                (if (null before-min) list
                  (let ((min (cdr before-min)))
                    (rplacd before-min (cdr min))
                    (rplacd min list)
                    min)))
             (when (funcall predicate (first curr) min)
               (setf before-min prev
                     min (first curr))))))
    (let ((result (min-first list)))
      (do ((head result (rest head)))
          ((endp (rest head)) result)
        (rplacd head (min-first (rest head)))))))
 
 