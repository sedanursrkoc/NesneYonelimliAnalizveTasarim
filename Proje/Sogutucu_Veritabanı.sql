--
-- PostgreSQL database dump
--

-- Dumped from database version 12.0
-- Dumped by pg_dump version 12rc1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: Internet_Kullanicisi; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Internet_Kullanicisi" (
    "kullaniciAdi" character varying(2044) NOT NULL,
    sifre integer NOT NULL,
    "kullaniciNo" integer NOT NULL
);


ALTER TABLE public."Internet_Kullanicisi" OWNER TO postgres;

--
-- Name: Sogutu; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Sogutu" (
    marka character varying(2044) NOT NULL,
    "seriNo" integer NOT NULL,
    "kullaniciNo" integer NOT NULL
);


ALTER TABLE public."Sogutu" OWNER TO postgres;

--
-- Data for Name: Internet_Kullanicisi; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public."Internet_Kullanicisi" VALUES ('Seda', 123456, 1);
INSERT INTO public."Internet_Kullanicisi" VALUES ('Kubra', 1234, 2);


--
-- Data for Name: Sogutu; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public."Sogutu" VALUES ('Toshiba', 1, 1);
INSERT INTO public."Sogutu" VALUES ('Samsung', 2, 2);


--
-- Name: Internet_Kullanicisi Internet_Kullanicisi_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Internet_Kullanicisi"
    ADD CONSTRAINT "Internet_Kullanicisi_pkey" PRIMARY KEY ("kullaniciAdi", sifre, "kullaniciNo");


--
-- Name: Sogutu Sogutu_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Sogutu"
    ADD CONSTRAINT "Sogutu_pkey" PRIMARY KEY (marka, "seriNo");


--
-- Name: Internet_Kullanicisi unique_Internet_Kullanicisi_kullaniciAdi; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Internet_Kullanicisi"
    ADD CONSTRAINT "unique_Internet_Kullanicisi_kullaniciAdi" UNIQUE ("kullaniciAdi");


--
-- Name: Internet_Kullanicisi unique_Internet_Kullanicisi_kullaniciNo; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Internet_Kullanicisi"
    ADD CONSTRAINT "unique_Internet_Kullanicisi_kullaniciNo" UNIQUE ("kullaniciNo");


--
-- Name: Internet_Kullanicisi unique_Internet_Kullanicisi_sifre; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Internet_Kullanicisi"
    ADD CONSTRAINT "unique_Internet_Kullanicisi_sifre" UNIQUE (sifre);


--
-- Name: Sogutu unique_Sogutu_marka; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Sogutu"
    ADD CONSTRAINT "unique_Sogutu_marka" UNIQUE (marka);


--
-- Name: Sogutu unique_Sogutu_seriNo; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Sogutu"
    ADD CONSTRAINT "unique_Sogutu_seriNo" UNIQUE ("seriNo");


--
-- Name: Sogutu lnk_Internet_Kullanicisi_Sogutu; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Sogutu"
    ADD CONSTRAINT "lnk_Internet_Kullanicisi_Sogutu" FOREIGN KEY ("kullaniciNo") REFERENCES public."Internet_Kullanicisi"("kullaniciNo") MATCH FULL ON UPDATE CASCADE ON DELETE CASCADE;


--
-- PostgreSQL database dump complete
--

