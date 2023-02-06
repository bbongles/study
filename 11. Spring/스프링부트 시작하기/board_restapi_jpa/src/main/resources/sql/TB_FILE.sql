-- insight.TB_FILE definition

CREATE TABLE `TB_FILE` (
  `IDX` int unsigned NOT NULL AUTO_INCREMENT COMMENT '일련번호',
  `BOARD_IDX` int unsigned NOT NULL COMMENT '게시글 번호',
  `ORIGINAL_FILE_NAME` varchar(255) NOT NULL COMMENT '원본 파일 이름',
  `STORED_FILE_NAME` varchar(500) NOT NULL COMMENT '파일 저 경로',
  `FILE_SIZE` int unsigned NOT NULL COMMENT '파일 크기',
  `CREATOR_ID` varchar(50) NOT NULL COMMENT '작성자 아이디',
  `CREATED_DATETIME` datetime NOT NULL COMMENT '작성시간',
  `UPDATER_ID` varchar(50) DEFAULT NULL COMMENT '수정자 아이디',
  `UPDATED_DATETIME` datetime DEFAULT NULL COMMENT '수정 시간',
  `DELETED_YN` char(1) NOT NULL DEFAULT 'N' COMMENT '삭제여부',
  PRIMARY KEY (`IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;