# MyTabLayout
MyTabLayout merupakan project sederhana yang membuat Tab Layout dengan ViewPager2. Selain itu, menerapkan implementasi tab layout dengan banyak fragment. Tidak hanya itu, project ini juga menerapkan konsep dalam pembuatan tab layout yang efisien apabila di dalam project mempunyai layout yang sama dan penggunaan data yang hampir sama dalam setiap fragmentnya. Atau biasa dikenal dengan Tab Layout with 1 Fragment

## Implementasi
1. Membuat komponen TabLayout dan ViewPager2 pada layout
2. Membuat 2 Fragment
3. Membuat adapter yang extend ke FragmentStateAdapter.
4. Menghubungkan TabLayout dan ViewPager2.
5. Membuat tampilan yang berbeda dengan mengirim data ke satu Fragment.

## What I Learn
1. Menerapkan Tab layout pada Activity, sehingga Constructor yang diperlukan yaitu *AppCompatActivity*. Apabila menerapkan diFragment, gunakan *FragmentActivity*
2. Membuat fragment berbeda di setiap tab Layout saat layout yang ditampilkan berbeda
3. Menampilkan Fragment
   * Baris pada *Comment Cara 1 adapter* : FragmentStateAdapter merupakan base adapter yang digunakan untuk mengatur data pada ViewPager2.
   * Baris pada *Comment Cara 2 adapter* : Pada dasarnya ViewPager2 dibuat menggunakan RecyclerView. jadi bisa memakai RecyclerView.Adapter sebagai adapter.
4. Menghubungkan viewPager2 dengan tabLayout menggunakan tablayoutMediator sebagai jembatan penghubung
5. Konsep dalam penggunaan Set Adapter(sectionPagerAdapter) sama seperti set adapter pada RecylerView
6. Argument digunakan untuk mengirimkan data bundle tersebut ke fragment.
7. Activity, fragment, service, ui toolkit, broadcast receiver dijalankan di main thread atau ui thread


