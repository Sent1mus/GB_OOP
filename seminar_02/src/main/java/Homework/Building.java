package Homework;

class Building implements Homework.Health {
        private int maxHealthPoint;
        private int currentHealthPoint;

        public Building(int maxHealthPoint) {
            this.maxHealthPoint = maxHealthPoint;
            this.currentHealthPoint = maxHealthPoint;
        }

        public void setCurrentHealthPoint(int currentHealthPoint) {
            this.currentHealthPoint = currentHealthPoint;
        }

        @Override
        public int getCurrentHealthPoint() {
            return currentHealthPoint;
        }

        @Override
        public int getMaxHealthPoint() {
            return maxHealthPoint;
        }
    }