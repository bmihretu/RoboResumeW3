package resume;

public class Skills {

    public class Skill {
        private String skillType;
        private String competencyProficiency;
        private int level;

        public Skill(String skillType, int level) {
            this.skillType = skillType;
            this.level = level;
            switch (this.level) {
                case 1:
                    this.competencyProficiency = "Fundamental";
                    break;
                case 2:
                    this.competencyProficiency = "Novice";
                    break;
                case 3:
                    this.competencyProficiency = "Intermediate";
                    break;
                case 4:
                    this.competencyProficiency = "Advanced";
                    break;
                case 5:
                    this.competencyProficiency = "Expert";
                    break;
                default:
                    System.out.println("Your level will be automatically set to Fundamental");
                    this.competencyProficiency = "Fundamental";
            }


        }

        public String getSkillName() {
            return skillType;
        }

        public void setSkillName(String skillName) {
            this.skillType = skillName;
        }

        public String getCompetencyProficiency() {
            return competencyProficiency;
        }

        public void setCompetencyProficiency(String competencyProficiency) {
            this.competencyProficiency = competencyProficiency;
        }

        @Override
        public String toString() {
            String result;
            result = "\n" + " " + this.skillType + "- Competency Proficiency: " + this.competencyProficiency + "\n";
            return result;
        }
    }
}