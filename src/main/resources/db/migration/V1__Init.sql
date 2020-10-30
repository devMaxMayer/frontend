CREATE TABLE "user" (
	"id" bigserial NOT NULL,
	"name" varchar(100) UNIQUE,
	"first_name" varchar(100) NOT NULL,
	"last_name" varchar(100) NOT NULL,
	"email" varchar(255) UNIQUE,
	"phone" varchar(12) NOT NULL UNIQUE,
	"password" varchar(255),
	"created" TIMESTAMP(6) NOT NULL,
	"update" TIMESTAMP(6),
	"status" varchar(15),
	CONSTRAINT "user_pk" PRIMARY KEY ("id")
);

CREATE TABLE "role" (
	"id" bigserial NOT NULL,
	"name" varchar(15) UNIQUE,
	CONSTRAINT "role_pk" PRIMARY KEY ("id")
);

CREATE TABLE "user_role" (
	"id" bigserial NOT NULL,
	"id_user" bigint NOT NULL,
	"id_role" bigint NOT NULL,
	CONSTRAINT "user_role_pk" PRIMARY KEY ("id")
);

CREATE TABLE "event" (
	"id" bigserial NOT NULL,
	"name" varchar(255),
	"status" varchar(50) NOT NULL,
	"id_event_type" bigint NOT NULL,
	CONSTRAINT "event_pk" PRIMARY KEY ("id")
);

CREATE TABLE "event_type" (
	"id" bigserial NOT NULL,
	"name" varchar(50) NOT NULL,
	CONSTRAINT "event_type_pk" PRIMARY KEY ("id")
);

CREATE TABLE "user_event" (
	"id" bigserial NOT NULL,
	"user_id" bigint NOT NULL,
	"event_id" bigint NOT NULL,
	CONSTRAINT "user_event_pk" PRIMARY KEY ("id")
);

CREATE TABLE "test" (
	"id" bigserial NOT NULL,
	"name" varchar(255) NOT NULL,
	"description" varchar(2048),
	CONSTRAINT "test_pk" PRIMARY KEY ("id")
);

CREATE TABLE "user_test" (
	"id" bigserial NOT NULL,
	"id_user" bigint NOT NULL,
	"id_test" bigint NOT NULL,
	"date_start" DATE NOT NULL DEFAULT 'now()',
	"date_finish" DATE,
	CONSTRAINT "user_test_pk" PRIMARY KEY ("id")
);

CREATE TABLE "question" (
	"id" bigserial NOT NULL,
	"id_test" bigint NOT NULL,
	"name" varchar(255) NOT NULL,
	"order" bigint NOT NULL,
	"text" varchar(2048) NOT NULL,
	"cost" bigint,
	CONSTRAINT "question_pk" PRIMARY KEY ("id")
);

CREATE TABLE "answer" (
	"id" bigserial NOT NULL,
	"name" varchar(255) NOT NULL,
	"id_question" bigint NOT NULL,
	"correct" BOOLEAN NOT NULL,
	CONSTRAINT "answer_pk" PRIMARY KEY ("id")
);

CREATE TABLE "user_question" (
	"id" bigserial NOT NULL,
	"id_user" bigint NOT NULL,
	"id_question" bigint NOT NULL,
	"id_answer" bigint,
	"date_start" DATE NOT NULL,
	"date_finish" DATE,
	CONSTRAINT "user_question_pk" PRIMARY KEY ("id")
);

CREATE TABLE "chat_room" (
	"id" bigserial NOT NULL,
	"id_creator_user" bigint NOT NULL,
	"id_chat_room_type" bigint NOT NULL,
	CONSTRAINT "chat_room_pk" PRIMARY KEY ("id")
);

CREATE TABLE "chat_room_user" (
	"id" bigserial NOT NULL,
	"id_user" bigint NOT NULL,
	"id_chat_room" bigint NOT NULL,
	CONSTRAINT "chat_room_user_pk" PRIMARY KEY ("id")
);

CREATE TABLE "message" (
	"id" bigserial NOT NULL,
	"id_user" bigint NOT NULL,
	"id_chat_room" bigint NOT NULL,
	"message" TEXT,
	CONSTRAINT "message_pk" PRIMARY KEY ("id")
);

CREATE TABLE "chat_room_type" (
	"id" bigserial NOT NULL,
	"name" varchar(50) NOT NULL,
	CONSTRAINT "chat_room_type_pk" PRIMARY KEY ("id")
);

ALTER TABLE "chat_room" ADD CONSTRAINT "chat_room_fk0" FOREIGN KEY ("id_creator_user") REFERENCES "user"("id");
ALTER TABLE "chat_room" ADD CONSTRAINT "chat_room_fk1" FOREIGN KEY ("id_chat_room_type") REFERENCES "chat_room_type"("id");

ALTER TABLE "chat_room_user" ADD CONSTRAINT "chat_room_user_fk0" FOREIGN KEY ("id_user") REFERENCES "user"("id");
ALTER TABLE "chat_room_user" ADD CONSTRAINT "chat_room_user_fk1" FOREIGN KEY ("id_chat_room") REFERENCES "chat_room"("id");

ALTER TABLE "message" ADD CONSTRAINT "message_fk0" FOREIGN KEY ("id_user") REFERENCES "user"("id");
ALTER TABLE "message" ADD CONSTRAINT "message_fk1" FOREIGN KEY ("id_chat_room") REFERENCES "chat_room"("id");


ALTER TABLE "user_role" ADD CONSTRAINT "user_role_fk0" FOREIGN KEY ("id_user") REFERENCES "user"("id");
ALTER TABLE "user_role" ADD CONSTRAINT "user_role_fk1" FOREIGN KEY ("id_role") REFERENCES "role"("id");

ALTER TABLE "event" ADD CONSTRAINT "event_fk0" FOREIGN KEY ("id_event_type") REFERENCES "event_type"("id");

ALTER TABLE "user_event" ADD CONSTRAINT "user_event_fk0" FOREIGN KEY ("user_id") REFERENCES "user"("id");
ALTER TABLE "user_event" ADD CONSTRAINT "user_event_fk1" FOREIGN KEY ("event_id") REFERENCES "event"("id");

ALTER TABLE "user_test" ADD CONSTRAINT "user_test_fk0" FOREIGN KEY ("id_user") REFERENCES "user"("id");
ALTER TABLE "user_test" ADD CONSTRAINT "user_test_fk1" FOREIGN KEY ("id_test") REFERENCES "test"("id");

ALTER TABLE "question" ADD CONSTRAINT "question_fk0" FOREIGN KEY ("id_test") REFERENCES "test"("id");

ALTER TABLE "answer" ADD CONSTRAINT "answer_fk0" FOREIGN KEY ("id_question") REFERENCES "question"("id");

ALTER TABLE "user_question" ADD CONSTRAINT "user_question_fk0" FOREIGN KEY ("id_user") REFERENCES "user"("id");
ALTER TABLE "user_question" ADD CONSTRAINT "user_question_fk1" FOREIGN KEY ("id_question") REFERENCES "question"("id");
ALTER TABLE "user_question" ADD CONSTRAINT "user_question_fk2" FOREIGN KEY ("id_answer") REFERENCES "answer"("id");
