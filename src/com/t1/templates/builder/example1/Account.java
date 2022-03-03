package com.t1.templates.builder.example1;

public class Account {

    private final String userId;
    private final String token;

    private Account() {
        userId = "";
        token = "";
    }

    private Account(String userId, String token) {
        this.userId = userId;
        this.token = token;
    }

    public String getUserId() {
        return userId;
    }

    public String getToken() {
        return token;
    }

    public static Builder newBuilder() {
        return new Account().new Builder();
    }

    @Override
    public String toString() {
        return "Account{" +
                "userId='" + userId + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

    public class Builder {

        private String userId;
        private String token;

        public Builder setUserId(String userId) {
            this.userId = userId;

            return this;
        }

        public Builder setToken(String token) {
            this.token = token;

            return this;
        }

        public Account build() {
            return new Account(userId, token);
        }

    }

}