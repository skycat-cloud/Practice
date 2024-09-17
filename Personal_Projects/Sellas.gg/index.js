import config from './myapi';

const headers = {
  'x-nxopen-api-key': API_KEY,
};

function getCharacterOcid() {
  // 입력된 캐릭터 식별자를 가져옴
  const characterOcid = document.getElementById('characterNameInput').value;
  const urlString = `https://open.api.nexon.com/maplestory/v1/id?character_name=${encodeURIComponent(
    characterOcid
  )}`;

  fetch(urlString, { headers })
    .then((response) => {
      if (!response.ok) {
        return response.json().then((errorData) => {
          throw new Error(
            `오류가 발생했습니다. 상태: ${response.status}, 메시지: ${
              response.statusText
            }, 상세: ${errorData.message || '오류'}`
          );
        });
      }
      return response.json();
    })
    .then((data) => {
      console.log(data); // 콘솔에 데이터 출력
      displayResultOcid(data); // 결과를 화면에 출력
      getCharacterBasic(data.ocid); // OCID를 가져온 후 캐릭터 기본 정보를 가져옵니다.
    })
    .catch((error) => {
      console.error('오류가 발생했습니다:', error);
      document.getElementById('resultOcidHtml').innerText = error.message;
    });
}

function displayResultOcid(data) {
  //ocid 값 출력
  const resultOcid = document.getElementById('resultOcidHtml');
  resultOcid.innerHTML = `<p><strong>캐릭터 OCID:</strong> ${data.ocid}</p>`;
}

function getCharacterBasic(ocid) {
  const urlString = `https://open.api.nexon.com/maplestory/v1/character/basic?ocid=${encodeURIComponent(
    ocid
  )}`;

  fetch(urlString, { headers })
    .then((response) => {
      if (!response.ok) {
        return response.json().then((errorData) => {
          throw new Error(
            `오류가 발생했습니다. 상태: ${response.status}, 메시지: ${
              response.statusText
            }, 상세: ${errorData.message || '오류'}`
          );
        });
      }
      return response.json();
    })
    .then((data) => {
      console.log(data); // 콘솔에 데이터 출력
      displayResultBasic(data);
    })
    .catch((error) => {
      console.error('오류가 발생했습니다:', error);
      document.getElementById('resultBasicHtml').innerText = error.message;
    });
}

function displayResultBasic(data) {
  const resultBasic = document.getElementById('resultBasicHtml');
  resultBasic.innerHTML = `<p><strong>캐릭터 기본 정보</strong></p>
    <p>닉네임: ${data.character_name}</p>
    <p>레벨: ${data.character_level}</p>
    <p>직업: ${data.character_class}</p>
    <p>월드: ${data.world_name}</p>
    <p>이미지: <img src="${data.character_image}" alt="캐릭터 이미지" style="max-width: 300px; height: auto;" /></p>`;
}
