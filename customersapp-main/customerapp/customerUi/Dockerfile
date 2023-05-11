FROM node:latest as builder
RUN mkdir -p /app
WORKDIR /app
COPY . . 
RUN npm install
RUN npm run build --prod

# CMD ["npm", "start"]

# FROM nginx:alpine
# COPY src/nginx/ect/conf.d/default.conf /etc/nginx/conf.d/default.conf
# COPY --from=node /app/dist/customerUi  /usr/share/nginx/html
# # EXPOSE 80