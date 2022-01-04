# 밥줘

#### 나만의 맛집 지도를 작성할 수 있는 서비스, '밥줘'

## Period
2021.12.28 ~ 2022.1.4

## Contributors

#### 김수민 [fosemfhtm](https://github.com/fosemfhtm)
#### 박현준 [Dookong](https://github.com/Dookong)

## Features

- 맛집 연락처 관리
- 맛집 사진 기록
- 맛집 위치 지도뷰

<img src="https://user-images.githubusercontent.com/96766097/148050366-dc45074e-f735-4310-b299-7c92bbb726ac.jpg" width="220" height="400"/>

## TAB1
<img src="https://user-images.githubusercontent.com/96766097/148050453-a01d77af-ffbd-4800-8aed-48575e42944e.jpg" width="220" height="400"/>


자신만의 맛집 연락처 리스트를 저장할 수 있는 탭입니다.


아이콘에 따라 한식/중식/일식/양식/패스트푸드/야식 으로 구분됩니다.




<img src="https://user-images.githubusercontent.com/96766097/148053658-bd352fe6-24dd-45ab-a533-b5f4c112bde7.jpg" width="220" height="400"/>


추가 버튼을 눌러 새로운 맛집을 등록할 수 있으며, 이름, 연락처, 주소를 입력하면 됩니다.




<img src="https://user-images.githubusercontent.com/96766097/148050495-0f4903b3-e23f-40b0-95d3-7023bf5ac326.jpg" width="220" height="400"/>


맛집을 누르면 저장해둔 정보를 이용해 정보창을 볼 수 있습니다.

인터넷의 블로그 리뷰, 연락처 및 통화 버튼, 주소 및 지도 어플 바로가기로 구성되어 있습니다.




<img src="https://user-images.githubusercontent.com/96766097/148050519-a76de679-247d-4243-99e8-0eb1676848f3.jpg" width="220" height="400"/>


음식 사진들을 따로 관리할 수 있는 갤러리가 있는 탭입니다.

추가 버튼을 눌러 저장된 사진을 추가하거나 바로 카메라로 사진을 찍어 저장할 수 있고, 사진을 길게 누르면 삭제됩니다.

사진을 한번 누르면 선택한 사진을 크게 볼 수 있고, 다시 한 번 누르면 원래대로 돌아옵니다.

<img src="https://user-images.githubusercontent.com/96766097/148050534-b01f844e-e009-4b7c-ac10-81e47bc3ba4a.jpg" width="220" height="400"/>



## Libraries

- [Retrofit](https://square.github.io/retrofit/) + [Gson](https://github.com/google/gson) : JSON 데이터를 활용한 REST API 통신
- [Glide](https://github.com/bumptech/glide) : 빠르고 정확한 이미지 로딩
- [Lottie](https://github.com/airbnb/lottie-android) : 움직이는 이미지를 이용한 스플래시 화면 구성
- [TedPermission](https://github.com/ParkSangGwon/TedPermission) : 안드로이드 시스템으로부터의 권환 획득 로직 간소화
- [TedImagePicker](https://github.com/ParkSangGwon/TedImagePicker) : 사용자 이미지 선택창 구현
- [NaverMap](https://www.ncloud.com/product/applicationService/maps) : 네이버 지도뷰를 활용한 화면 구성
