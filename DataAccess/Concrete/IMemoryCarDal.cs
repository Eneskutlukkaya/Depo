using DataAccess.Abstract;
using Entities.Concrete;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace DataAccess.Concrete
{
    public class IMemoryCarDal : ICarDal
    {
        List<Car> _car;
        public IMemoryCarDal()
        {
            _car = new List<Car>
            {
                new Car{Id=1,CarName="FİAT",BrandId=1,ColorId=2,ModelYear=2018,DailyPrice=150,Description="Aile arabası arayanlara"},
                new Car{Id=2,CarName="FORD",BrandId=2,ColorId=2,ModelYear=2017,DailyPrice=200,Description="Ticari araçtır."},
                new Car{Id=3,CarName="OPEL",BrandId=4,ColorId=2,ModelYear=2020,DailyPrice=170,Description="Kurumsal firmalara uygundur."},
                new Car{Id=4,CarName="BMW",BrandId=5,ColorId=2,ModelYear=2019,DailyPrice=250,Description="Performans arayanlara..."},
                new Car{Id=5,CarName="MERCEDES",BrandId=3,ColorId=2,ModelYear=2021,DailyPrice=450,Description="Konforundan vazgeçemeyenler."}

            };
        }
        public void Add(Car car)
        {
            _car.Add(car);
        }

        public void Delete(Car car)
        {
            Car carToDelete = _car.SingleOrDefault(c => c.Id == car.Id);
        }

        public List<Car> GettAll()
        {
            return _car;
        }

        public List<Car> GettAllByBrand(int brandId)
        {
            return _car.Where(c => c.BrandId == brandId).ToList(); 
        }

        

        public void Update(Car car)
        {
            Car carToUpdate = _car.SingleOrDefault(c => c.Id == car.Id);
            carToUpdate.Id = car.Id;
            carToUpdate.CarName = car.CarName;
            carToUpdate.BrandId = car.BrandId;
            carToUpdate.ColorId = car.ColorId;
            carToUpdate.ModelYear = car.ModelYear;
            carToUpdate.DailyPrice = car.DailyPrice;
            carToUpdate.Description = car.Description;

        }
    }
}
