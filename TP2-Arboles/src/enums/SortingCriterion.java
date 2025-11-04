package enums;

import interfaces.IPerson;

public enum SortingCriterion {
    ID {
        public int compare(IPerson a, IPerson b) {
            return a.compareByID(b);
        }
    },
    NAME {
        public int compare(IPerson a, IPerson b) {
            return a.compareByFullName(b);
        }
    },
    AGE {
        public int compare(IPerson a,IPerson b) {
            return a.compareByAge(b);
        }
    };

    public abstract int compare(IPerson a, IPerson b);
}
