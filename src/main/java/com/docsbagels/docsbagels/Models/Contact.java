package com.docsbagels.docsbagels.Models;

public class Contact {

    public class Customer {

        private String name;
        private String lastName;
        private String email;
        private String comment;

        public Customer() {

        }

        public Customer(String name, String email, String lastName) {
            this();
            this.name = name;
            this.lastName = lastName;
            this.email = email;
            this.comment = comment;
        }
        public String getname() {
            return name;
        }

        public void setname(String name) {
            this.name = name;
        }
        public String getlastName() {
            return lastName;
        }

        public void setlastName(String lastName) {
            this.lastName = lastName;
        }
        public String getemail() {
            return email;
        }

        public void setemail(String email) {
            this.email = email;
        }
        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }
    }
}
