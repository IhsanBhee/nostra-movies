PGDMP     8    :                z            nostra_movie    14.3    14.2     
           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            
           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            
           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            	
           1262    25438    nostra_movie    DATABASE     l   CREATE DATABASE nostra_movie WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_Indonesia.1252';
    DROP DATABASE nostra_movie;
                nostra    false            Ñ            1259    33868 
   m_category    TABLE     Ý   CREATE TABLE public.m_category (
    id bigint NOT NULL,
    name character varying(20),
    created_by integer,
    created timestamp without time zone,
    updated_by integer,
    updated timestamp without time zone
);
    DROP TABLE public.m_category;
       public         heap    nostra    false            Ò            1259    33873    m_category_id_seq    SEQUENCE     Ð   ALTER TABLE public.m_category ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.m_category_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    MAXVALUE 999
    CACHE 1
);
            public          nostra    false    209            Ó            1259    33875    m_movie    TABLE     ´  CREATE TABLE public.m_movie (
    id bigint NOT NULL,
    title character varying(50),
    director character varying(100),
    description character varying(500),
    poster_path character varying(255),
    rate_average double precision,
    release_date timestamp without time zone,
    category_id bigint,
    created_by bigint,
    created timestamp without time zone,
    updated_by bigint,
    updated timestamp with time zone
);
    DROP TABLE public.m_movie;
       public         heap    postgres    false            Ô            1259    33882    m_movie_id_seq    SEQUENCE     Ö   ALTER TABLE public.m_movie ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.m_movie_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    MAXVALUE 999999999999999
    CACHE 1
);
            public          postgres    false    211            ×            1259    33889    m_user    TABLE     Ô   CREATE TABLE public.m_user (
    id bigint NOT NULL,
    first_name character varying(50),
    last_name character varying(50),
    email timestamp without time zone,
    birth_day timestamp without time zone
);
    DROP TABLE public.m_user;
       public         heap    nostra    false            Õ            1259    33883 	   t_booking    TABLE     [  CREATE TABLE public.t_booking (
    id bigint NOT NULL,
    movie_id bigint,
    user_id bigint,
    status character varying(10),
    start_time timestamp without time zone,
    end_time timestamp without time zone,
    created_by bigint,
    created timestamp without time zone,
    updated_by bigint,
    updated timestamp without time zone
);
    DROP TABLE public.t_booking;
       public         heap    nostra    false            Ö            1259    33888    t_booking_id_seq    SEQUENCE     Ú   ALTER TABLE public.t_booking ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.t_booking_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    MAXVALUE 999999999999999
    CACHE 1
);
            public          nostra    false    213            ý          0    33868 
   m_category 
   TABLE DATA           X   COPY public.m_category (id, name, created_by, created, updated_by, updated) FROM stdin;
    public          nostra    false    209   Ó       ÿ          0    33875    m_movie 
   TABLE DATA           £   COPY public.m_movie (id, title, director, description, poster_path, rate_average, release_date, category_id, created_by, created, updated_by, updated) FROM stdin;
    public          postgres    false    211   —       
          0    33889    m_user 
   TABLE DATA           M   COPY public.m_user (id, first_name, last_name, email, birth_day) FROM stdin;
    public          nostra    false    215          
          0    33883 	   t_booking 
   TABLE DATA           ‚   COPY public.t_booking (id, movie_id, user_id, status, start_time, end_time, created_by, created, updated_by, updated) FROM stdin;
    public          nostra    false    213   ª       

           0    0    m_category_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.m_category_id_seq', 8, true);
          public          nostra    false    210            
           0    0    m_movie_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.m_movie_id_seq', 2, true);
          public          postgres    false    212            
           0    0    t_booking_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.t_booking_id_seq', 1, false);
          public          nostra    false    214            k           2606    33872    m_category m_category_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.m_category
    ADD CONSTRAINT m_category_pkey PRIMARY KEY (id);
 D   ALTER TABLE ONLY public.m_category DROP CONSTRAINT m_category_pkey;
       public            nostra    false    209            m           2606    33881    m_movie m_movie_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.m_movie
    ADD CONSTRAINT m_movie_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.m_movie DROP CONSTRAINT m_movie_pkey;
       public            postgres    false    211            q           2606    33893    m_user m_user_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.m_user
    ADD CONSTRAINT m_user_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.m_user DROP CONSTRAINT m_user_pkey;
       public            nostra    false    215            o           2606    33887    t_booking t_booking_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.t_booking
    ADD CONSTRAINT t_booking_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.t_booking DROP CONSTRAINT t_booking_pkey;
       public            nostra    false    213            ý   ´   xœ}Ï1ŽÃ0DÑš<Å^ ER¤íNpØ@b²›rÿsd·IcAõûÅL„<Ÿ[Ù!óüý‡eb’%S·."Ã\^Ëý÷Z¥‰$D£ÄCQà^ó+7£!ù8¦.¢Â#ïg>š+Ø‚‘ÅQºˆ	ÖRk©­J4'uí"ó¶ìórÍìÿ/§h±gè°nÇYjãˆM‘‚ˆ‰sq€s­Ûó¹4®üuttš;¾ˆï€ˆŒ·gß      ÿ   æ  xœ}RËnÛ0<Ë_±ÈµŽ 9®íøÚÒ '¹ô²2	‰¹øˆá[ÿ¡Ø/éP‹œ
µ3š]Î°­ƒû±(:Y”ÕÍÈôÆ&aUw3‰^ü»þÌºsZŽ:˜Ä#)¶ì(ê.ó@“'|ÀKO¶Ù•ª 4L3hèïï?(Ê‘ƒaµbÇØPÇÉHM¯ì²,ÉqäÂŠ&‹\˜’=4ûLÞê}(-&íº,y Úc4•µ°-sqÏ†~ø(äIŸ™žQ´´üàéÓ.GŒY6q`R ÖUµ®VÍjußlï›
5Í~~ªëZowÔ¶ûf·_më¶i·›õMðK³]¬ªç8Fs¤7¬¢'ïŒ/Õ7o1Ì!èwLìÏÕw7q¢Äð‡IÚÂÈQ,G`Òl9Ókî,‡%N->r9‚;òìÏ`TžìÕ¡VÞŽÃ`É¡(¶2Êb¸¦Ÿ:jã:ü~
2ð#Òœ<®–”±]O(
ÿÕf<éÄSaêhÈjî3e„>BMBq…ö¨S¹{e>î
å•žûƒ5Ø<"8ÓQs*]®Wï„“Ôeg>åµû·òjwûõCÝl¾îo‚%¯_õb±ø9š
      
   
   xœ‹Ñãââ Å ©      
   
   xœ‹Ñãââ Å ©     
